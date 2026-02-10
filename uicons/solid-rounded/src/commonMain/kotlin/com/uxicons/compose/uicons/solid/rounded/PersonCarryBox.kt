package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonCarryBox: ImageVector? = null

val Icons.Sr.PersonCarryBox: ImageVector
    get() = _PersonCarryBox ?: UXIcon(name = "PersonCarryBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-1.38f)
                lineToRelative(-1.26f, -2.52f)
                curveToRelative(-0.43f, -0.86f, -1.11f, -1.61f, -1.97f, -2.04f)
                curveToRelative(-2.7f, -1.35f, -5.39f, 0.58f, -5.39f, 3.16f)
                lineToRelative(0.06f, 4.06f)
                curveToRelative(0.02f, 1.21f, 0.66f, 2.33f, 1.7f, 2.95f)
                lineToRelative(2.76f, 1.66f)
                curveToRelative(0.3f, 0.18f, 0.48f, 0.51f, 0.48f, 0.86f)
                verticalLineToRelative(3.87f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.87f)
                curveToRelative(0f, -1.05f, -0.55f, -2.03f, -1.45f, -2.57f)
                lineToRelative(-0.55f, -0.33f)
                verticalLineToRelative(-7.69f)
                curveToRelative(0.19f, 0.17f, 0.34f, 0.38f, 0.46f, 0.61f)
                lineToRelative(1.37f, 2.74f)
                curveToRelative(0.34f, 0.68f, 1.03f, 1.11f, 1.79f, 1.11f)
                horizontalLineToRelative(6.88f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(6f, 20f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _PersonCarryBox = it}
