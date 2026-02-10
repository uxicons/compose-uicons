package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShekelSign: ImageVector? = null

val Icons.Ts.ShekelSign: ImageVector
    get() = _ShekelSign ?: UXIcon(name = "ShekelSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 24.09f)
                horizontalLineToRelative(-1f)
                verticalLineTo(0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(4.14f, 0f, 7.5f, 3.36f, 7.5f, 7.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(-1f)
                verticalLineTo(7.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                horizontalLineTo(3f)
                verticalLineTo(24.09f)
                close()
                moveTo(22f, 15.92f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1f)
                verticalLineTo(15.92f)
                curveToRelative(0f, 3.9f, -3.18f, 7.08f, -7.08f, 7.08f)
                horizontalLineToRelative(-4.92f)
                verticalLineTo(6f)
                horizontalLineToRelative(-1f)
                verticalLineTo(24f)
                horizontalLineToRelative(5.92f)
                curveToRelative(4.46f, 0f, 8.08f, -3.63f, 8.08f, -8.08f)
                close()
            }
        }.also { _ShekelSign = it}
