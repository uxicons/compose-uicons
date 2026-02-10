package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Couch: ImageVector? = null

val Icons.Sr.Couch: ImageVector
    get() = _Couch ?: UXIcon(name = "Couch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                horizontalLineToRelative(8f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                verticalLineToRelative(1f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(3f)
                lineTo(6f, 15f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(21.66f, 10.03f)
                curveToRelative(-0.98f, 0.16f, -1.66f, 1.08f, -1.66f, 2.08f)
                verticalLineToRelative(3.89f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(5f, 17f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.89f)
                curveToRelative(0f, -1.0f, -0.68f, -1.92f, -1.66f, -2.08f)
                curveToRelative(-1.25f, -0.2f, -2.34f, 0.76f, -2.34f, 1.97f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.64f, 0.79f, 3.09f, 2f, 4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.1f)
                curveToRelative(0.32f, 0.07f, 0.66f, 0.1f, 1f, 0.1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.34f, 0f, 0.68f, -0.03f, 1f, -0.1f)
                verticalLineToRelative(1.1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(1.21f, -0.91f, 2f, -2.36f, 2f, -4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.22f, -1.08f, -2.18f, -2.34f, -1.97f)
                close()
            }
        }.also { _Couch = it}
