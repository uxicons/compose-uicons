package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Table: ImageVector? = null

val Icons.Rs.Table: ImageVector
    get() = _Table ?: UXIcon(name = "Table") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 2f)
                lineTo(3f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(13f, 8f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-5f)
                close()
                moveTo(11f, 13f)
                lineTo(2f, 13f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(5f)
                close()
                moveTo(3f, 4f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                lineTo(2f, 6f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 15f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(5f)
                lineTo(2f, 20f)
                verticalLineToRelative(-5f)
                close()
                moveTo(13f, 20f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-9f)
                close()
            }
        }.also { _Table = it}
