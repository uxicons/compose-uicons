package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NodeJs: ImageVector? = null

val Icons.Brand.NodeJs: ImageVector
    get() = _NodeJs ?: UXIcon(name = "NodeJs") {
        path(
            fill = SolidColor(Color.Black),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12.57f, 0.15f)
            curveToRelative(-0.35f, -0.2f, -0.79f, -0.2f, -1.14f, 0f)
            lineTo(2.03f, 5.58f)
            curveTo(1.67f, 5.78f, 1.46f, 6.16f, 1.46f, 6.57f)
            verticalLineToRelative(10.87f)
            curveToRelative(0f, 0.41f, 0.22f, 0.78f, 0.57f, 0.98f)
            lineToRelative(9.41f, 5.43f)
            curveToRelative(0.35f, 0.2f, 0.79f, 0.2f, 1.14f, 0f)
            lineToRelative(9.4f, -5.43f)
            curveToRelative(0.35f, -0.2f, 0.57f, -0.58f, 0.57f, -0.98f)
            verticalLineTo(6.57f)
            curveToRelative(0f, -0.41f, -0.22f, -0.78f, -0.57f, -0.98f)
            lineTo(12.57f, 0.15f)
            close()
        }
    }.also { _NodeJs = it }
