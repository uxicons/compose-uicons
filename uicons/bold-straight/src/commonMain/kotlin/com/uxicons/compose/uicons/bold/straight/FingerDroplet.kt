package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FingerDroplet: ImageVector? = null

val Icons.Bs.FingerDroplet: ImageVector
    get() = _FingerDroplet ?: UXIcon(name = "FingerDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-5.94f)
                lineToRelative(-3.98f, -3.98f)
                curveToRelative(-1.36f, -1.36f, -3.58f, -1.36f, -4.97f, 0.02f)
                lineTo(-0.01f, 7.4f)
                lineTo(0.0f, 22f)
                horizontalLineToRelative(14.17f)
                lineToRelative(2f, -8f)
                horizontalLineToRelative(3.83f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                close()
                moveTo(13.83f, 11f)
                lineToRelative(-2f, 8f)
                lineTo(3.0f, 19f)
                lineToRelative(-0.01f, -10.4f)
                lineToRelative(4.27f, -4.46f)
                curveToRelative(0.2f, -0.19f, 0.51f, -0.19f, 0.71f, 0f)
                lineToRelative(1.85f, 1.85f)
                horizontalLineToRelative(-1.82f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6.17f)
                close()
                moveTo(22.96f, 17.91f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.88f, 2.12f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.13f, -4.24f, 0f)
                curveToRelative(-0.57f, -0.57f, -0.88f, -1.32f, -0.88f, -2.12f)
                reflectiveCurveToRelative(0.31f, -1.55f, 0.87f, -2.11f)
                lineToRelative(2.13f, -2.08f)
                lineToRelative(2.12f, 2.08f)
                close()
            }
        }.also { _FingerDroplet = it}
