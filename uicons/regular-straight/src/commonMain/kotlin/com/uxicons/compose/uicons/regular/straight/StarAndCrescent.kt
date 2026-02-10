package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarAndCrescent: ImageVector? = null

val Icons.Rs.StarAndCrescent: ImageVector
    get() = _StarAndCrescent ?: UXIcon(name = "StarAndCrescent") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(0f, -4.07f, 2.89f, -7.93f, 7.02f, -9.39f)
                lineToRelative(2.36f, -0.83f)
                lineToRelative(-2.29f, -1.02f)
                curveToRelative(-1.14f, -0.51f, -2.48f, -0.75f, -4.1f, -0.75f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(1.62f, 0f, 2.83f, -0.22f, 4.07f, -0.75f)
                lineToRelative(2.38f, -1.0f)
                lineToRelative(-2.43f, -0.86f)
                curveToRelative(-4.13f, -1.46f, -7.02f, -5.32f, -7.02f, -9.39f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                curveToRelative(0.24f, 0f, 0.47f, 0.01f, 0.69f, 0.02f)
                curveToRelative(-3.49f, 2.21f, -5.69f, 5.95f, -5.69f, 9.98f)
                reflectiveCurveToRelative(2.2f, 7.77f, 5.69f, 9.98f)
                curveToRelative(-0.22f, 0.01f, -0.45f, 0.02f, -0.69f, 0.02f)
                close()
                moveTo(24f, 10.83f)
                lineToRelative(-2.54f, 1.74f)
                lineToRelative(1.06f, 3.32f)
                lineToRelative(-0.68f, 0.48f)
                lineToRelative(-2.82f, -1.95f)
                lineToRelative(-2.78f, 1.95f)
                lineToRelative(-0.66f, -0.49f)
                lineToRelative(0.98f, -3.35f)
                lineToRelative(-2.57f, -1.68f)
                verticalLineToRelative(-0.84f)
                horizontalLineToRelative(3.5f)
                lineToRelative(1.07f, -3.64f)
                horizontalLineToRelative(0.88f)
                lineToRelative(1.07f, 3.64f)
                horizontalLineToRelative(3.48f)
                verticalLineToRelative(0.83f)
                close()
            }
        }.also { _StarAndCrescent = it}
