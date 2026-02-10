package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CategoryAlt: ImageVector? = null

val Icons.Ts.CategoryAlt: ImageVector
    get() = _CategoryAlt ?: UXIcon(name = "CategoryAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(3f, 11f)
                horizontalLineToRelative(8f)
                lineTo(11f, 3f)
                lineTo(3f, 3f)
                verticalLineToRelative(8f)
                close()
                moveTo(4f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(8f)
                lineTo(21f, 3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(8f)
                close()
                moveTo(14f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(3f, 21f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-8f)
                lineTo(3f, 13f)
                verticalLineToRelative(8f)
                close()
                moveTo(4f, 14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(13f, 21f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(8f)
                close()
                moveTo(14f, 14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _CategoryAlt = it}
