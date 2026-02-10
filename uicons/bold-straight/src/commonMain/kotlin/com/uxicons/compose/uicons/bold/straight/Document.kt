package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Document: ImageVector? = null

val Icons.Bs.Document: ImageVector
    get() = _Document ?: UXIcon(name = "Document") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 10f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(7f, 18f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(22f, 5.88f)
                verticalLineToRelative(18.12f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(11.12f)
                close()
                moveTo(19f, 21f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(18f)
                close()
            }
        }.also { _Document = it}
