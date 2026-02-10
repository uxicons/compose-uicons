package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldDividedFour: ImageVector? = null

val Icons.Ss.ShieldDividedFour: ImageVector
    get() = _ShieldDividedFour ?: UXIcon(name = "ShieldDividedFour") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 11f)
                verticalLineTo(0f)
                lineTo(4.3f, 2.22f)
                curveToRelative(-1.38f, 0.46f, -2.3f, 1.74f, -2.3f, 3.19f)
                verticalLineToRelative(5.59f)
                horizontalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 11f)
                horizontalLineToRelative(9f)
                verticalLineTo(5.41f)
                curveToRelative(0f, -1.45f, -0.93f, -2.73f, -2.3f, -3.18f)
                lineTo(13f, 0f)
                verticalLineTo(11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 13f)
                verticalLineToRelative(11f)
                curveToRelative(2.29f, -0.96f, 8.62f, -4.17f, 8.97f, -11f)
                horizontalLineTo(13f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 13f)
                horizontalLineTo(2.04f)
                curveToRelative(0.38f, 6.09f, 6.74f, 9.86f, 8.96f, 11f)
                verticalLineTo(13f)
                close()
            }
        }.also { _ShieldDividedFour = it}
