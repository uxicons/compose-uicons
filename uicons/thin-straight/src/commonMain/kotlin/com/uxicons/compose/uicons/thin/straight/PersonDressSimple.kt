package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDressSimple: ImageVector? = null

val Icons.Ts.PersonDressSimple: ImageVector
    get() = _PersonDressSimple ?: UXIcon(name = "PersonDressSimple") {
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
                moveTo(17.97f, 20f)
                lineToRelative(-2.17f, -11.95f)
                curveToRelative(-0.22f, -1.19f, -1.25f, -2.05f, -2.46f, -2.05f)
                horizontalLineToRelative(-1.66f)
                curveToRelative(-1.21f, 0f, -2.24f, 0.86f, -2.46f, 2.05f)
                lineToRelative(-2.17f, 11.95f)
                horizontalLineToRelative(2.96f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2.97f)
                close()
                moveTo(10.2f, 8.23f)
                curveToRelative(0.13f, -0.71f, 0.75f, -1.23f, 1.48f, -1.23f)
                horizontalLineToRelative(1.66f)
                curveToRelative(0.73f, 0f, 1.35f, 0.52f, 1.48f, 1.23f)
                lineToRelative(1.96f, 10.77f)
                lineTo(8.24f, 19f)
                lineToRelative(1.95f, -10.77f)
                close()
            }
        }.also { _PersonDressSimple = it}
