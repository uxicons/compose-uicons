package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skull: ImageVector? = null

val Icons.Rr.Skull: ImageVector
    get() = _Skull ?: UXIcon(name = "Skull") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.75f, 0.02f)
                curveToRelative(-3.08f, -0.2f, -6.01f, 0.84f, -8.26f, 2.94f)
                curveTo(2.27f, 5.04f, 1f, 7.97f, 1f, 11f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.42f, 1.73f, 4.45f, 4.02f, 4.9f)
                curveToRelative(0.2f, 2.29f, 2.14f, 4.1f, 4.48f, 4.1f)
                horizontalLineToRelative(5f)
                curveToRelative(2.35f, 0f, 4.28f, -1.8f, 4.48f, -4.1f)
                curveToRelative(2.29f, -0.46f, 4.02f, -2.48f, 4.02f, -4.9f)
                verticalLineToRelative(-3.65f)
                curveTo(23f, 5.38f, 18.5f, 0.41f, 12.75f, 0.02f)
                close()
                moveTo(21f, 15f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.48f, 1.04f, -4.87f, 2.86f, -6.57f)
                curveToRelative(1.69f, -1.58f, 3.85f, -2.43f, 6.14f, -2.43f)
                curveToRelative(0.21f, 0f, 0.41f, 0.01f, 0.62f, 0.02f)
                curveToRelative(4.7f, 0.31f, 8.38f, 4.41f, 8.38f, 9.33f)
                verticalLineToRelative(3.65f)
                close()
                moveTo(10f, 11f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(18f, 11f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(14f, 17.0f)
                curveToRelative(0f, 1.1f, -0.9f, 1f, -2f, 1f)
                reflectiveCurveToRelative(-2f, 0.1f, -2f, -1f)
                reflectiveCurveToRelative(0.9f, -3f, 2f, -3f)
                reflectiveCurveToRelative(2f, 1.9f, 2f, 3f)
                close()
            }
        }.also { _Skull = it}
