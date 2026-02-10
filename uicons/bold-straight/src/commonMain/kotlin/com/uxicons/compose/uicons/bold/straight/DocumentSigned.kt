package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentSigned: ImageVector? = null

val Icons.Bs.DocumentSigned: ImageVector
    get() = _DocumentSigned ?: UXIcon(name = "DocumentSigned") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.68f, 3.56f)
                lineToRelative(-2.24f, -2.24f)
                arcToRelative(4.53f, 4.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.18f, -1.32f)
                horizontalLineToRelative(-9.76f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-17.26f)
                arcToRelative(4.47f, 4.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.32f, -3.18f)
                close()
                moveTo(5f, 21f)
                verticalLineToRelative(-17.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(14f)
                close()
                moveTo(16f, 13f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                close()
                moveTo(13.87f, 15.02f)
                lineTo(16.72f, 15.97f)
                curveToRelative(-0.37f, 1.13f, -1.54f, 3.03f, -3.58f, 3.03f)
                arcToRelative(3.68f, 3.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.27f, -0.8f)
                arcToRelative(1.41f, 1.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.31f, -0.2f)
                arcToRelative(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.8f, 0.82f)
                lineToRelative(-2.5f, -1.66f)
                curveToRelative(0.34f, -0.5f, 1.57f, -2.16f, 3.23f, -2.16f)
                arcToRelative(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.11f, 0.76f)
                curveToRelative(0.3f, 0.22f, 0.35f, 0.24f, 0.54f, 0.24f)
                curveToRelative(0.2f, 0f, 0.59f, -0.55f, 0.73f, -0.98f)
                close()
            }
        }.also { _DocumentSigned = it}
