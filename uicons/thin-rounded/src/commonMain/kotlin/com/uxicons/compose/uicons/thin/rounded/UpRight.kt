package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpRight: ImageVector? = null

val Icons.Tr.UpRight: ImageVector
    get() = _UpRight ?: UXIcon(name = "UpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.91f, 23f)
                curveToRelative(-0.94f, 0f, -1.81f, -0.36f, -2.48f, -1.03f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(-0.66f, -0.66f, -1.02f, -1.54f, -1.02f, -2.47f)
                reflectiveCurveToRelative(0.36f, -1.81f, 1.02f, -2.47f)
                lineToRelative(7.93f, -7.93f)
                lineToRelative(-2.18f, -2.18f)
                curveToRelative(-0.77f, -0.77f, -0.98f, -1.87f, -0.57f, -2.88f)
                curveToRelative(0.42f, -1f, 1.35f, -1.62f, 2.44f, -1.62f)
                horizontalLineToRelative(9.85f)
                curveToRelative(1.93f, 0f, 3.5f, 1.58f, 3.5f, 3.5f)
                verticalLineTo(14.35f)
                curveToRelative(0f, 1.09f, -0.62f, 2.02f, -1.62f, 2.44f)
                curveToRelative(-1f, 0.42f, -2.1f, 0.2f, -2.88f, -0.56f)
                lineToRelative(-2.18f, -2.18f)
                lineToRelative(-7.93f, 7.93f)
                curveToRelative(-0.66f, 0.66f, -1.54f, 1.03f, -2.47f, 1.03f)
                close()
                moveTo(9.65f, 2f)
                curveToRelative(-0.81f, 0f, -1.31f, 0.52f, -1.52f, 1.01f)
                curveToRelative(-0.2f, 0.49f, -0.22f, 1.21f, 0.35f, 1.79f)
                lineToRelative(2.53f, 2.53f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                lineTo(2.73f, 16.32f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.77f)
                reflectiveCurveToRelative(0.26f, 1.29f, 0.73f, 1.77f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.94f, 0.94f, 2.59f, 0.95f, 3.54f, 0f)
                lineTo(15.96f, 12.98f)
                curveToRelative(0.09f, -0.09f, 0.22f, -0.15f, 0.35f, -0.15f)
                horizontalLineToRelative(0f)
                curveToRelative(0.13f, 0f, 0.26f, 0.05f, 0.35f, 0.15f)
                lineToRelative(2.53f, 2.54f)
                curveToRelative(0.57f, 0.57f, 1.3f, 0.55f, 1.79f, 0.35f)
                curveToRelative(0.49f, -0.2f, 1.01f, -0.71f, 1.01f, -1.52f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineTo(9.65f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                close()
                moveTo(2.38f, 15.96f)
                horizontalLineToRelative(0f)
                close()
            }
        }.also { _UpRight = it}
