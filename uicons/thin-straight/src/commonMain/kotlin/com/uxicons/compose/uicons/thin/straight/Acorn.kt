package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Acorn: ImageVector? = null

val Icons.Ts.Acorn: ImageVector
    get() = _Acorn ?: UXIcon(name = "Acorn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 7.75f)
                curveToRelative(0f, -3.17f, -2.58f, -5.75f, -5.75f, -5.75f)
                horizontalLineToRelative(-4.75f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 2f)
                lineTo(6.75f, 2f)
                curveTo(3.58f, 2f, 1f, 4.58f, 1f, 7.75f)
                verticalLineToRelative(1.25f)
                lineTo(3f, 9f)
                verticalLineToRelative(4.88f)
                curveToRelative(0f, 6.74f, 8.47f, 9.9f, 8.83f, 10.03f)
                lineToRelative(0.17f, 0.06f)
                lineToRelative(0.17f, -0.06f)
                curveToRelative(0.36f, -0.13f, 8.83f, -3.29f, 8.83f, -10.03f)
                verticalLineToRelative(-4.88f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.25f)
                close()
                moveTo(20f, 13.88f)
                curveToRelative(0f, 5.55f, -6.82f, 8.55f, -8f, 9.03f)
                curveToRelative(-1.18f, -0.48f, -8f, -3.47f, -8f, -9.03f)
                verticalLineToRelative(-4.88f)
                lineTo(20f, 9f)
                verticalLineToRelative(4.88f)
                close()
                moveTo(22f, 8f)
                lineTo(2f, 8f)
                verticalLineToRelative(-0.25f)
                curveToRelative(0f, -2.62f, 2.13f, -4.75f, 4.75f, -4.75f)
                horizontalLineToRelative(10.5f)
                curveToRelative(2.62f, 0f, 4.75f, 2.13f, 4.75f, 4.75f)
                verticalLineToRelative(0.25f)
                close()
            }
        }.also { _Acorn = it}
