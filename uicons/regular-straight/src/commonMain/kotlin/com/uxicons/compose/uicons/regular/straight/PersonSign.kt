package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonSign: ImageVector? = null

val Icons.Rs.PersonSign: ImageVector
    get() = _PersonSign ?: UXIcon(name = "PersonSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-5f)
                lineToRelative(-1.8f, -2.4f)
                curveToRelative(-0.75f, -1.0f, -1.95f, -1.6f, -3.2f, -1.6f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-12.0f)
                lineToRelative(-1.5f, -2.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.63f, 0f, 1.23f, 0.3f, 1.6f, 0.8f)
                lineToRelative(2.4f, 3.2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(3.5f)
                lineTo(24f, 0f)
                close()
                moveTo(22f, 5.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(4.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _PersonSign = it}
