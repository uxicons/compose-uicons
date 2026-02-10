package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownToLine: ImageVector? = null

val Icons.Tr.DownToLine: ImageVector
    get() = _DownToLine ?: UXIcon(name = "DownToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 24f)
                lineTo(0.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(23.5f, 23f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(14.67f, 19.91f)
                lineToRelative(6.56f, -7.35f)
                curveToRelative(0.77f, -0.77f, 0.98f, -1.88f, 0.57f, -2.88f)
                curveToRelative(-0.42f, -1.01f, -1.36f, -1.65f, -2.45f, -1.65f)
                horizontalLineToRelative(-2.34f)
                lineTo(17.01f, 3.47f)
                curveToRelative(0f, -1.92f, -1.57f, -3.47f, -3.51f, -3.47f)
                horizontalLineToRelative(-2.99f)
                curveToRelative(-1.93f, 0f, -3.51f, 1.56f, -3.51f, 3.47f)
                verticalLineToRelative(4.55f)
                reflectiveCurveToRelative(-2.33f, 0f, -2.33f, 0f)
                curveToRelative(-1.1f, 0f, -2.04f, 0.64f, -2.45f, 1.65f)
                reflectiveCurveToRelative(-0.19f, 2.12f, 0.56f, 2.88f)
                lineToRelative(6.59f, 7.38f)
                curveToRelative(0.73f, 0.73f, 1.68f, 1.09f, 2.64f, 1.09f)
                reflectiveCurveToRelative(1.93f, -0.37f, 2.67f, -1.11f)
                close()
                moveTo(7.5f, 9.03f)
                curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.35f, -0.15f)
                reflectiveCurveToRelative(0.15f, -0.22f, 0.15f, -0.35f)
                lineTo(8f, 3.47f)
                curveToRelative(0f, -1.36f, 1.12f, -2.47f, 2.5f, -2.47f)
                horizontalLineToRelative(2.99f)
                curveToRelative(1.38f, 0f, 2.51f, 1.11f, 2.51f, 2.47f)
                verticalLineToRelative(5.05f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.84f)
                curveToRelative(0.82f, 0f, 1.33f, 0.54f, 1.53f, 1.03f)
                curveToRelative(0.2f, 0.5f, 0.21f, 1.23f, -0.36f, 1.81f)
                curveToRelative(0f, 0f, -0.01f, 0.01f, -0.02f, 0.02f)
                lineToRelative(-6.55f, 7.34f)
                curveToRelative(-1.07f, 1.07f, -2.81f, 1.07f, -3.86f, 0.02f)
                lineTo(3.49f, 11.86f)
                curveToRelative(-0.58f, -0.58f, -0.57f, -1.31f, -0.36f, -1.81f)
                curveToRelative(0.2f, -0.5f, 0.71f, -1.03f, 1.53f, -1.03f)
                horizontalLineToRelative(2.84f)
                close()
            }
        }.also { _DownToLine = it}
