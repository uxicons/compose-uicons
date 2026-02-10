package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Form: ImageVector? = null

val Icons.Ss.Form: ImageVector
    get() = _Form ?: UXIcon(name = "Form") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 14f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(21f, 7f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                close()
                moveTo(17f, 10f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(10f)
                close()
                moveTo(19.83f, 3.41f)
                lineTo(17.59f, 1.17f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.59f, -0.95f)
                verticalLineToRelative(4.78f)
                horizontalLineToRelative(4.79f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.96f, -1.59f)
                close()
            }
        }.also { _Form = it}
