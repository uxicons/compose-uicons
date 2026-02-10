package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpLeft: ImageVector? = null

val Icons.Tr.UpLeft: ImageVector
    get() = _UpLeft ?: UXIcon(name = "UpLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.09f, 23f)
                curveToRelative(-0.9f, 0f, -1.79f, -0.34f, -2.48f, -1.02f)
                lineToRelative(-7.93f, -7.93f)
                lineToRelative(-2.18f, 2.18f)
                curveToRelative(-0.77f, 0.77f, -1.88f, 0.98f, -2.88f, 0.56f)
                curveToRelative(-1f, -0.42f, -1.62f, -1.35f, -1.62f, -2.44f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineTo(14.35f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(1.09f, 0f, 2.02f, 0.62f, 2.44f, 1.62f)
                curveToRelative(0.42f, 1f, 0.2f, 2.11f, -0.56f, 2.88f)
                lineToRelative(-2.18f, 2.18f)
                lineToRelative(7.93f, 7.93f)
                horizontalLineToRelative(0f)
                curveToRelative(0.66f, 0.66f, 1.02f, 1.54f, 1.02f, 2.47f)
                reflectiveCurveToRelative(-0.36f, 1.81f, -1.02f, 2.47f)
                lineToRelative(-1.41f, 1.42f)
                curveToRelative(-0.68f, 0.68f, -1.58f, 1.02f, -2.47f, 1.02f)
                close()
                moveTo(7.68f, 12.84f)
                curveToRelative(0.13f, 0f, 0.26f, 0.05f, 0.35f, 0.15f)
                lineToRelative(8.28f, 8.28f)
                curveToRelative(0.97f, 0.97f, 2.56f, 0.98f, 3.54f, 0f)
                lineToRelative(1.41f, -1.42f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                reflectiveCurveToRelative(-0.26f, -1.29f, -0.73f, -1.77f)
                lineTo(12.99f, 8.03f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(2.53f, -2.53f)
                curveToRelative(0.57f, -0.57f, 0.55f, -1.3f, 0.35f, -1.79f)
                curveToRelative(-0.2f, -0.49f, -0.71f, -1.01f, -1.51f, -1.01f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.13f, -2.5f, 2.5f)
                verticalLineTo(14.35f)
                curveToRelative(0f, 0.81f, 0.52f, 1.31f, 1.01f, 1.52f)
                curveToRelative(0.49f, 0.2f, 1.21f, 0.22f, 1.79f, -0.35f)
                lineToRelative(2.53f, -2.53f)
                curveToRelative(0.1f, -0.1f, 0.23f, -0.15f, 0.35f, -0.15f)
                close()
            }
        }.also { _UpLeft = it}
