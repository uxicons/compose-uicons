package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDress: ImageVector? = null

val Icons.Ss.PersonDress: ImageVector
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
                lineToRelative(5.88f, -6.43f)
                curveToRelative(0.55f, -0.55f, 1.3f, -0.9f, 2.12f, -0.9f)
                horizontalLineToRelative(1.47f)
                curveToRelative(0.83f, 0f, 1.58f, 0.35f, 2.12f, 0.9f)
                lineToRelative(5.88f, 6.43f)
                lineToRelative(-1.48f, 1.35f)
                close()
            }
        }.also { _PersonDress = it}
