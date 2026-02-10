package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lesson: ImageVector? = null

val Icons.Rs.Lesson: ImageVector
    get() = _Lesson ?: UXIcon(name = "Lesson") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.76f, 12.36f)
                lineToRelative(-5.76f, 3.64f)
                lineToRelative(3f, 1.9f)
                verticalLineToRelative(4.65f)
                reflectiveCurveToRelative(1.14f, 1.46f, 4f, 1.46f)
                reflectiveCurveToRelative(4f, -1.46f, 4f, -1.46f)
                verticalLineToRelative(-4.65f)
                lineToRelative(1f, -0.63f)
                verticalLineToRelative(4.74f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                lineToRelative(-5.76f, -3.64f)
                curveToRelative(-0.74f, -0.47f, -1.73f, -0.47f, -2.47f, 0f)
                close()
                moveTo(14f, 21.58f)
                curveToRelative(-0.39f, 0.2f, -1.03f, 0.42f, -2f, 0.42f)
                curveToRelative(-1.0f, 0f, -1.66f, -0.23f, -2.04f, -0.44f)
                lineToRelative(0.01f, -2.42f)
                lineToRelative(0.79f, 0.5f)
                curveToRelative(0.37f, 0.23f, 0.8f, 0.36f, 1.24f, 0.36f)
                reflectiveCurveToRelative(0.87f, -0.12f, 1.24f, -0.36f)
                lineToRelative(0.76f, -0.48f)
                verticalLineToRelative(2.42f)
                close()
                moveTo(12.17f, 17.95f)
                curveToRelative(-0.1f, 0.06f, -0.23f, 0.07f, -0.34f, 0f)
                lineToRelative(-3.09f, -1.95f)
                lineToRelative(3.09f, -1.95f)
                curveToRelative(0.1f, -0.06f, 0.23f, -0.07f, 0.34f, 0f)
                lineToRelative(3.09f, 1.95f)
                lineToRelative(-3.09f, 1.95f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                lineTo(2f, 20f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 7f)
                lineTo(2f, 7f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 4.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 4.5f)
                moveToRelative(-1.5f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
            }
        }.also { _Lesson = it}
