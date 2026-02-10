package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Refrigerator: ImageVector? = null

val Icons.Ts.Refrigerator: ImageVector
    get() = _Refrigerator ?: UXIcon(name = "Refrigerator") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(20f)
                lineTo(22f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4.5f, 1f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                lineTo(3f, 9f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3f, 23f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(13f)
                lineTo(3f, 23f)
                close()
            }
        }.also { _Refrigerator = it}
