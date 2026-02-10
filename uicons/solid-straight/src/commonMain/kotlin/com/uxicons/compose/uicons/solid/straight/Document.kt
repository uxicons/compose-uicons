package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Document: ImageVector? = null

val Icons.Ss.Document: ImageVector
    get() = _Document ?: UXIcon(name = "Document") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                verticalLineToRelative(-4.41f)
                close()
                moveTo(22f, 7f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(7f)
                close()
                moveTo(7f, 16f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                close()
                moveTo(17f, 10f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                close()
            }
        }.also { _Document = it}
