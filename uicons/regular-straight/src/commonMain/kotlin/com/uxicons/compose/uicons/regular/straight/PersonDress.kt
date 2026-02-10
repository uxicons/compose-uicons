package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDress: ImageVector? = null

val Icons.Rs.PersonDress: ImageVector
    get() = _PersonDress ?: UXIcon(name = "PersonDress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(19.26f, 14.67f)
                lineToRelative(-3.24f, -3.55f)
                lineToRelative(1.11f, 8.87f)
                horizontalLineToRelative(-2.13f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2.13f)
                lineToRelative(1.11f, -8.87f)
                lineToRelative(-3.24f, 3.55f)
                lineToRelative(-1.48f, -1.35f)
                reflectiveCurveToRelative(5.81f, -6.37f, 5.85f, -6.41f)
                lineToRelative(0.02f, -0.03f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, -0.55f, 1.3f, -0.89f, 2.13f, -0.89f)
                horizontalLineToRelative(1.47f)
                curveToRelative(0.83f, 0f, 1.58f, 0.34f, 2.13f, 0.89f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveToRelative(0.02f, 0.02f, 0.02f, 0.02f)
                curveToRelative(0.04f, 0.04f, 5.85f, 6.41f, 5.85f, 6.41f)
                lineToRelative(-1.48f, 1.35f)
                close()
                moveTo(12.73f, 8f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-0.47f, 0f, -0.9f, 0.29f, -0.99f, 0.88f)
                lineToRelative(-1.14f, 9.12f)
                horizontalLineToRelative(5.73f)
                lineToRelative(-1.14f, -9.12f)
                curveToRelative(-0.07f, -0.58f, -0.49f, -0.88f, -0.99f, -0.88f)
                close()
            }
        }.also { _PersonDress = it}
