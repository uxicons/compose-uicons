package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDollyEmpty: ImageVector? = null

val Icons.Rs.PersonDollyEmpty: ImageVector
    get() = _PersonDollyEmpty ?: UXIcon(name = "PersonDollyEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 2.5f)
                curveTo(1f, 1.12f, 2.12f, 0f, 3.5f, 0f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(1f, 3.88f, 1f, 2.5f)
                close()
                moveTo(24.01f, 19.06f)
                lineToRelative(-0.45f, -1.95f)
                lineToRelative(-8.58f, 1.99f)
                lineToRelative(-3.05f, -13.15f)
                lineToRelative(-1.95f, 0.45f)
                lineToRelative(1.07f, 4.6f)
                horizontalLineToRelative(-2.42f)
                lineToRelative(-1.67f, -3.34f)
                curveToRelative(-0.51f, -1.02f, -1.54f, -1.66f, -2.68f, -1.66f)
                horizontalLineToRelative(-1.76f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.66f)
                curveToRelative(0f, 0.88f, 0.45f, 1.67f, 1.2f, 2.14f)
                lineToRelative(3.8f, 2.27f)
                verticalLineToRelative(5.43f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.57f)
                lineToRelative(-4.76f, -2.85f)
                curveToRelative(-0.15f, -0.09f, -0.24f, -0.25f, -0.24f, -0.43f)
                verticalLineToRelative(-5.66f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(5.31f)
                lineToRelative(2f, 1.2f)
                verticalLineToRelative(-4.27f)
                lineToRelative(1.38f, 2.76f)
                horizontalLineToRelative(4.12f)
                lineToRelative(1.41f, 6.07f)
                curveToRelative(-1.1f, 0.26f, -1.91f, 1.25f, -1.91f, 2.43f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -0.2f, -0.02f, -0.39f, -0.07f, -0.57f)
                lineToRelative(8.07f, -1.87f)
                close()
                moveTo(1f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.3f)
                lineToRelative(-2f, -1.2f)
                verticalLineToRelative(5.49f)
                close()
            }
        }.also { _PersonDollyEmpty = it}
