package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notary: ImageVector? = null

val Icons.Bs.Notary: ImageVector
    get() = _Notary ?: UXIcon(name = "Notary") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -0.35f, -0.06f, -0.68f, -0.14f, -1f)
                horizontalLineToRelative(6.2f)
                curveToRelative(-0.03f, -0.2f, -0.06f, -0.39f, -0.06f, -0.55f)
                curveToRelative(0f, -0.91f, 0.28f, -1.75f, 0.75f, -2.45f)
                horizontalLineToRelative(-10.75f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(11f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(21f, 19f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-7.13f)
                curveToRelative(0.08f, -0.32f, 0.13f, -0.66f, 0.13f, -1f)
                verticalLineToRelative(-1f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.75f)
                curveToRelative(-0.63f, -1.34f, -1.25f, -2.86f, -1.25f, -3.55f)
                curveToRelative(0f, -1.38f, 1.12f, -2.45f, 2.5f, -2.45f)
                reflectiveCurveToRelative(2.5f, 1.07f, 2.5f, 2.45f)
                curveToRelative(0f, 0.69f, -0.63f, 2.21f, -1.25f, 3.55f)
                horizontalLineToRelative(0.75f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                close()
            }
        }.also { _Notary = it}
