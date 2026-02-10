package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SecondMedal: ImageVector? = null

val Icons.Rs.SecondMedal: ImageVector
    get() = _SecondMedal ?: UXIcon(name = "SecondMedal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.97f, 0f)
                horizontalLineToRelative(-9.09f)
                lineToRelative(-2.88f, 5.83f)
                lineTo(9.12f, 0f)
                lineTo(0.02f, 0f)
                lineToRelative(4.75f, 9.63f)
                curveToRelative(-1.12f, 1.5f, -1.78f, 3.36f, -1.78f, 5.37f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -2.01f, -0.66f, -3.87f, -1.78f, -5.37f)
                lineTo(23.97f, 0f)
                close()
                moveTo(16.12f, 2f)
                horizontalLineToRelative(4.63f)
                lineToRelative(-3.01f, 6.08f)
                curveToRelative(-1.06f, -0.88f, -2.33f, -1.53f, -3.71f, -1.85f)
                lineToRelative(2.1f, -4.23f)
                close()
                moveTo(7.88f, 2f)
                lineToRelative(2.09f, 4.23f)
                curveToRelative(-1.39f, 0.32f, -2.66f, 0.97f, -3.73f, 1.85f)
                lineTo(3.24f, 2f)
                horizontalLineToRelative(4.64f)
                close()
                moveTo(11.99f, 22f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
                moveTo(12.34f, 16.73f)
                curveToRelative(-0.14f, 0.09f, -0.28f, 0.18f, -0.41f, 0.27f)
                horizontalLineToRelative(3.07f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.47f, 1.19f, -2.25f, 2.23f, -2.94f)
                curveToRelative(1.1f, -0.73f, 1.77f, -1.23f, 1.77f, -2.06f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 1.97f, -1.54f, 2.98f, -2.66f, 3.73f)
                close()
            }
        }.also { _SecondMedal = it}
