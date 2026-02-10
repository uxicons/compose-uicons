package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonSign: ImageVector? = null

val Icons.Bs.PersonSign: ImageVector
    get() = _PersonSign ?: UXIcon(name = "PersonSign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24f, 0f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.75f)
                lineToRelative(-1.65f, -2.2f)
                curveToRelative(-0.85f, -1.13f, -2.19f, -1.8f, -3.6f, -1.8f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.47f, 0f, 0.92f, 0.23f, 1.2f, 0.6f)
                lineToRelative(2.55f, 3.4f)
                horizontalLineToRelative(8.25f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                close()
            }
        }.also { _PersonSign = it}
