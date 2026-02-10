package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeleteDocument: ImageVector? = null

val Icons.Br.DeleteDocument: ImageVector
    get() = _DeleteDocument ?: UXIcon(name = "DeleteDocument") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.56f, 13.56f)
            lineToRelative(-1.44f, 1.44f)
            lineToRelative(1.44f, 1.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 2.12f)
            lineToRelative(-1.44f, -1.44f)
            lineToRelative(-1.44f, 1.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, -2.12f)
            lineToRelative(1.44f, -1.44f)
            lineToRelative(-1.44f, -1.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, -2.12f)
            lineToRelative(1.44f, 1.44f)
            lineToRelative(1.44f, -1.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, 2.12f)
            close()
            moveTo(22f, 8.16f)
            verticalLineToRelative(10.34f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, 5.5f)
            horizontalLineToRelative(-9f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.5f, -5.5f)
            verticalLineToRelative(-13f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, -5.5f)
            horizontalLineToRelative(6.34f)
            arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.89f, 1.61f)
            lineToRelative(2.66f, 2.66f)
            arcToRelative(5.46f, 5.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.61f, 3.89f)
            close()
            moveTo(19f, 18.5f)
            verticalLineToRelative(-9.5f)
            horizontalLineToRelative(-4f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(-5.5f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 2.5f)
            horizontalLineToRelative(9f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, -2.5f)
            close()
        }
    }.also { _DeleteDocument = it }
