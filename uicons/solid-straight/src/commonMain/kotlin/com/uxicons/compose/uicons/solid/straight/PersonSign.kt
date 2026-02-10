package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonSign: ImageVector? = null

val Icons.Ss.PersonSign: ImageVector
    get() = _PersonSign ?: UXIcon(name = "PersonSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 0f)
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
                verticalLineToRelative(-15.3f)
                curveToRelative(0.03f, 0.04f, 0.07f, 0.07f, 0.1f, 0.11f)
                lineToRelative(2.4f, 3.2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(3.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(-9f)
                close()
                moveTo(4.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _PersonSign = it}
