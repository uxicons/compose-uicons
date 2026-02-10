package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoteMedical: ImageVector? = null

val Icons.Tr.NoteMedical: ImageVector
    get() = _NoteMedical ?: UXIcon(name = "NoteMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 12.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(24.04f, 15.43f)
                curveToRelative(0f, 1.47f, -0.57f, 2.85f, -1.61f, 3.89f)
                lineToRelative(-3.07f, 3.07f)
                curveToRelative(-1.04f, 1.04f, -2.42f, 1.61f, -3.89f, 1.61f)
                lineTo(4.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(-0.04f, 4.5f)
                curveTo(-0.04f, 2.02f, 1.98f, 0f, 4.46f, 0f)
                horizontalLineToRelative(15.04f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                lineToRelative(0.04f, 10.93f)
                close()
                moveTo(15.47f, 23f)
                curveToRelative(0.19f, 0f, 0.38f, -0.03f, 0.57f, -0.06f)
                verticalLineToRelative(-4.44f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4.44f)
                curveToRelative(0.02f, -0.19f, 0.06f, -0.38f, 0.06f, -0.57f)
                lineToRelative(-0.04f, -10.93f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.46f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineToRelative(0.04f, 15.0f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(10.97f)
                close()
                moveTo(22.75f, 17f)
                horizontalLineToRelative(-4.21f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4.21f)
                curveToRelative(0.6f, -0.22f, 1.15f, -0.56f, 1.61f, -1.02f)
                lineToRelative(3.07f, -3.07f)
                curveToRelative(0.46f, -0.46f, 0.8f, -1.01f, 1.02f, -1.61f)
                close()
            }
        }.also { _NoteMedical = it}
