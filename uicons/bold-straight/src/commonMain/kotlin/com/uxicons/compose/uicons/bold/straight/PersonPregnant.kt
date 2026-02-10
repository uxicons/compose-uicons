package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPregnant: ImageVector? = null

val Icons.Bs.PersonPregnant: ImageVector
    get() = _PersonPregnant ?: UXIcon(name = "PersonPregnant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(19f, 15f)
                curveToRelative(0f, 1.79f, -0.97f, 4.67f, -1.08f, 4.99f)
                lineToRelative(-0.35f, 1.01f)
                horizontalLineToRelative(-2.57f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.2f)
                lineToRelative(1.49f, -11.93f)
                curveToRelative(0.22f, -1.75f, 1.71f, -3.07f, 3.47f, -3.07f)
                horizontalLineToRelative(1.47f)
                curveToRelative(1.76f, 0f, 3.25f, 1.32f, 3.47f, 3.07f)
                lineToRelative(0.08f, 0.64f)
                curveToRelative(1.95f, 1.02f, 3.21f, 3.04f, 3.21f, 5.29f)
                close()
                moveTo(16f, 15f)
                curveToRelative(0f, -1.28f, -0.83f, -2.42f, -2.06f, -2.83f)
                lineToRelative(-0.9f, -0.3f)
                lineToRelative(-0.31f, -2.43f)
                curveToRelative(-0.03f, -0.25f, -0.24f, -0.44f, -0.5f, -0.44f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-0.25f, 0f, -0.47f, 0.19f, -0.5f, 0.44f)
                lineToRelative(-0.27f, 2.14f)
                lineToRelative(3.17f, 1.58f)
                lineToRelative(-1.34f, 2.68f)
                lineToRelative(-2.22f, -1.11f)
                lineToRelative(-0.41f, 3.27f)
                horizontalLineToRelative(6.2f)
                curveToRelative(0.3f, -1.03f, 0.6f, -2.29f, 0.6f, -3f)
                close()
            }
        }.also { _PersonPregnant = it}
