package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDollyEmpty: ImageVector? = null

val Icons.Sr.PersonDollyEmpty: ImageVector
    get() = _PersonDollyEmpty ?: UXIcon(name = "PersonDollyEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 2.5f)
                curveTo(1f, 1.12f, 2.12f, 0f, 3.5f, 0f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(1f, 3.88f, 1f, 2.5f)
                close()
                moveTo(23.23f, 19.24f)
                lineToRelative(-7.29f, 1.69f)
                curveToRelative(0.04f, 0.18f, 0.07f, 0.37f, 0.07f, 0.57f)
                curveToRelative(0f, 1.6f, -1.5f, 2.85f, -3.17f, 2.41f)
                curveToRelative(-0.85f, -0.22f, -1.54f, -0.92f, -1.75f, -1.77f)
                curveToRelative(-0.36f, -1.45f, 0.55f, -2.77f, 1.84f, -3.08f)
                lineToRelative(-1.37f, -6.07f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(-0.76f, 0f, -1.45f, -0.43f, -1.79f, -1.1f)
                lineToRelative(-1.37f, -2.74f)
                curveToRelative(-0.12f, -0.23f, -0.27f, -0.44f, -0.46f, -0.61f)
                verticalLineToRelative(7.69f)
                lineToRelative(0.55f, 0.33f)
                curveToRelative(0.9f, 0.54f, 1.45f, 1.52f, 1.45f, 2.57f)
                verticalLineToRelative(3.87f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.87f)
                curveToRelative(0f, -0.35f, -0.18f, -0.68f, -0.48f, -0.86f)
                lineToRelative(-2.76f, -1.66f)
                curveTo(0.71f, 15.99f, 0.07f, 14.87f, 0.06f, 13.66f)
                lineToRelative(-0.06f, -4.06f)
                curveToRelative(0f, -2.58f, 2.69f, -4.51f, 5.39f, -3.16f)
                curveToRelative(0.86f, 0.43f, 1.54f, 1.18f, 1.97f, 2.04f)
                lineToRelative(1.26f, 2.52f)
                horizontalLineToRelative(2.48f)
                lineToRelative(-1.08f, -4.78f)
                curveToRelative(-0.12f, -0.54f, 0.22f, -1.07f, 0.76f, -1.2f)
                curveToRelative(0.54f, -0.12f, 1.07f, 0.22f, 1.2f, 0.76f)
                lineToRelative(3.0f, 13.32f)
                lineToRelative(7.79f, -1.8f)
                curveToRelative(0.54f, -0.12f, 1.07f, 0.21f, 1.2f, 0.75f)
                curveToRelative(0.12f, 0.54f, -0.21f, 1.07f, -0.75f, 1.2f)
                close()
                moveTo(2f, 19f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _PersonDollyEmpty = it}
