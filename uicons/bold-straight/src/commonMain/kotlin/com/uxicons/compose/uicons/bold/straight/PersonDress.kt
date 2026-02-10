package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDress: ImageVector? = null

val Icons.Bs.PersonDress: ImageVector
    get() = _PersonDress ?: UXIcon(name = "PersonDress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(19.46f, 15.57f)
                lineToRelative(-2.24f, -2.46f)
                lineToRelative(0.99f, 7.88f)
                horizontalLineToRelative(-2.2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.2f)
                lineToRelative(0.99f, -7.88f)
                lineToRelative(-2.24f, 2.46f)
                lineToRelative(-2.22f, -2.02f)
                lineToRelative(5.87f, -6.43f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.64f, -0.69f, 1.56f, -1.12f, 2.56f, -1.12f)
                horizontalLineToRelative(1.47f)
                curveToRelative(1.0f, 0f, 1.92f, 0.43f, 2.56f, 1.12f)
                lineToRelative(0.0f, -0.0f)
                lineToRelative(5.87f, 6.43f)
                lineToRelative(-2.22f, 2.02f)
                close()
                moveTo(11.77f, 9f)
                curveToRelative(-0.25f, 0f, -0.47f, 0.19f, -0.5f, 0.44f)
                lineToRelative(-1.07f, 8.56f)
                horizontalLineToRelative(4.6f)
                lineToRelative(-1.07f, -8.56f)
                curveToRelative(-0.03f, -0.25f, -0.24f, -0.44f, -0.5f, -0.44f)
                horizontalLineToRelative(-1.47f)
                close()
            }
        }.also { _PersonDress = it}
