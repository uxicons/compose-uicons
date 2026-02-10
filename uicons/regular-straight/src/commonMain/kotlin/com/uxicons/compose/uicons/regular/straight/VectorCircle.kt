package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VectorCircle: ImageVector? = null

val Icons.Rs.VectorCircle: ImageVector
    get() = _VectorCircle ?: UXIcon(name = "VectorCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9f)
                horizontalLineToRelative(-1.94f)
                curveToRelative(-1.01f, -3.39f, -3.67f, -6.06f, -7.07f, -7.07f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1.94f)
                curveToRelative(-3.39f, 1.01f, -6.06f, 3.67f, -7.07f, 7.07f)
                lineTo(0f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.94f)
                curveToRelative(1.01f, 3.39f, 3.67f, 6.06f, 7.07f, 7.07f)
                verticalLineToRelative(1.94f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1.94f)
                curveToRelative(3.39f, -1.01f, 6.06f, -3.67f, 7.07f, -7.07f)
                horizontalLineToRelative(1.94f)
                verticalLineToRelative(-6f)
                close()
                moveTo(22f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(11f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(4f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(15f, 19.96f)
                verticalLineToRelative(-1.96f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1.96f)
                curveToRelative(-2.28f, -0.86f, -4.1f, -2.67f, -4.96f, -4.96f)
                horizontalLineToRelative(1.96f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1.96f)
                curveToRelative(0.86f, -2.28f, 2.67f, -4.1f, 4.96f, -4.96f)
                verticalLineToRelative(1.96f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1.96f)
                curveToRelative(2.28f, 0.86f, 4.1f, 2.67f, 4.96f, 4.96f)
                horizontalLineToRelative(-1.96f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.96f)
                curveToRelative(-0.86f, 2.28f, -2.67f, 4.1f, -4.96f, 4.96f)
                close()
            }
        }.also { _VectorCircle = it}
