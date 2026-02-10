package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ItalianLiraSign: ImageVector? = null

val Icons.Rs.ItalianLiraSign: ImageVector
    get() = _ItalianLiraSign ?: UXIcon(name = "ItalianLiraSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                verticalLineToRelative(-2f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineTo(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                curveTo(5f, 3.59f, 8.59f, 0f, 13f, 0f)
                reflectiveCurveToRelative(7.55f, 3.14f, 7.69f, 3.28f)
                lineToRelative(-1.38f, 1.45f)
                reflectiveCurveToRelative(-2.91f, -2.72f, -6.31f, -2.72f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.12f, -0.37f, 2.16f, -1f, 3f)
                horizontalLineTo(22f)
                close()
            }
        }.also { _ItalianLiraSign = it}
