package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonLunge: ImageVector? = null

val Icons.Ts.PersonLunge: ImageVector
    get() = _PersonLunge ?: UXIcon(name = "PersonLunge") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(13.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(15f, 16f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.75f, 0f, -1.5f, 0.25f, -2.14f, 0.73f)
                lineToRelative(-3.36f, 3.05f)
                verticalLineToRelative(0.67f)
                lineToRelative(1.53f, 4.22f)
                lineToRelative(0.94f, -0.35f)
                lineToRelative(-1.47f, -3.96f)
                verticalLineToRelative(-0.14f)
                lineToRelative(3f, -2.72f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(11f, 14.5f)
                lineTo(11f, 7.06f)
                curveToRelative(0.16f, -0.03f, 0.33f, -0.06f, 0.5f, -0.06f)
                horizontalLineToRelative(1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(10.17f, 18.33f)
                curveToRelative(0.28f, 0.17f, 0.59f, 0.31f, 0.91f, 0.42f)
                lineToRelative(-1.88f, 5.25f)
                lineTo(2f, 24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.5f)
                lineToRelative(1.67f, -4.67f)
                close()
            }
        }.also { _PersonLunge = it}
