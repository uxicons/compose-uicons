package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDress: ImageVector? = null

val Icons.Ts.PersonDress: ImageVector
    get() = _PersonDress ?: UXIcon(name = "PersonDress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(12.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(20.87f, 13.1f)
                lineToRelative(-5.72f, -6.32f)
                curveToRelative(-0.46f, -0.48f, -1.11f, -0.78f, -1.81f, -0.78f)
                horizontalLineToRelative(-1.66f)
                curveToRelative(-0.76f, 0f, -1.44f, 0.34f, -1.91f, 0.88f)
                lineToRelative(-5.64f, 6.22f)
                lineToRelative(0.74f, 0.67f)
                lineToRelative(4.13f, -4.56f)
                lineToRelative(-1.96f, 10.79f)
                horizontalLineToRelative(2.96f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2.97f)
                lineToRelative(-1.96f, -10.79f)
                lineToRelative(4.13f, 4.55f)
                lineToRelative(0.74f, -0.67f)
                close()
                moveTo(14.81f, 8.23f)
                lineToRelative(1.96f, 10.77f)
                lineTo(8.24f, 19f)
                lineToRelative(1.95f, -10.77f)
                curveToRelative(0.13f, -0.8f, 0.88f, -1.23f, 1.48f, -1.23f)
                horizontalLineToRelative(1.66f)
                curveToRelative(0.67f, 0f, 1.33f, 0.5f, 1.48f, 1.23f)
                close()
            }
        }.also { _PersonDress = it}
