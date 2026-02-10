package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stocking: ImageVector? = null

val Icons.Tr.Stocking: ImageVector
    get() = _Stocking ?: UXIcon(name = "Stocking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 0f)
                lineTo(7.5f, 0f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(6.88f)
                curveToRelative(0f, 1.06f, -0.67f, 2.01f, -1.67f, 2.36f)
                lineToRelative(-2.73f, 0.96f)
                curveTo(1.15f, 12.27f, -0.78f, 15.96f, 0.3f, 19.4f)
                curveToRelative(0.86f, 2.75f, 3.37f, 4.6f, 6.25f, 4.6f)
                curveToRelative(0.66f, 0f, 1.32f, -0.1f, 1.97f, -0.3f)
                lineToRelative(7.71f, -2.61f)
                curveToRelative(3.45f, -1.17f, 5.78f, -4.4f, 5.78f, -8.05f)
                lineTo(22f, 1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(21f, 13.04f)
                curveToRelative(0f, 3.22f, -2.05f, 6.07f, -5.1f, 7.1f)
                lineToRelative(-7.7f, 2.6f)
                curveToRelative(-0.54f, 0.17f, -1.1f, 0.25f, -1.66f, 0.25f)
                curveToRelative(-2.44f, 0f, -4.57f, -1.56f, -5.29f, -3.9f)
                curveToRelative(-0.91f, -2.92f, 0.72f, -6.04f, 3.66f, -6.96f)
                lineToRelative(2.75f, -0.96f)
                curveToRelative(1.4f, -0.49f, 2.34f, -1.82f, 2.34f, -3.3f)
                lineTo(10f, 1f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(12.04f)
                close()
            }
        }.also { _Stocking = it}
