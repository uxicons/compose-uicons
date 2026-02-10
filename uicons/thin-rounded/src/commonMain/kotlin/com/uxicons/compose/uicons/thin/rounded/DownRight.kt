package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownRight: ImageVector? = null

val Icons.Tr.DownRight: ImageVector
    get() = _DownRight ?: UXIcon(name = "DownRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.65f, 23f)
                curveToRelative(-1.09f, 0f, -2.02f, -0.62f, -2.44f, -1.62f)
                curveToRelative(-0.42f, -1f, -0.2f, -2.1f, 0.57f, -2.88f)
                lineToRelative(2.18f, -2.18f)
                lineTo(2.02f, 8.39f)
                curveToRelative(-1.37f, -1.37f, -1.37f, -3.58f, 0f, -4.95f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(1.36f, -1.37f, 3.58f, -1.37f, 4.95f, 0f)
                lineToRelative(7.93f, 7.93f)
                lineToRelative(2.18f, -2.18f)
                curveToRelative(0.77f, -0.77f, 1.88f, -0.98f, 2.88f, -0.56f)
                curveToRelative(1f, 0.42f, 1.62f, 1.35f, 1.62f, 2.44f)
                verticalLineToRelative(9.85f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineTo(9.65f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                close()
                moveTo(5.91f, 2f)
                curveToRelative(-0.64f, 0f, -1.28f, 0.24f, -1.77f, 0.73f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-0.97f, 0.97f, -0.97f, 2.56f, 0f, 3.54f)
                lineTo(11.01f, 15.97f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(-2.53f, 2.53f)
                curveToRelative(-0.57f, 0.57f, -0.55f, 1.3f, -0.35f, 1.79f)
                reflectiveCurveToRelative(0.71f, 1.01f, 1.52f, 1.01f)
                horizontalLineToRelative(9.85f)
                curveToRelative(1.38f, 0f, 2.5f, -1.13f, 2.5f, -2.5f)
                verticalLineTo(9.65f)
                curveToRelative(0f, -0.81f, -0.52f, -1.31f, -1.01f, -1.52f)
                curveToRelative(-0.49f, -0.2f, -1.21f, -0.22f, -1.79f, 0.35f)
                lineToRelative(-2.53f, 2.53f)
                curveToRelative(-0.19f, 0.19f, -0.52f, 0.19f, -0.71f, 0f)
                lineTo(7.68f, 2.73f)
                curveToRelative(-0.49f, -0.49f, -1.13f, -0.73f, -1.77f, -0.73f)
                close()
            }
        }.also { _DownRight = it}
