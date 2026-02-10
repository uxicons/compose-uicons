package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Globe: ImageVector? = null

val Icons.Br.Globe: ImageVector
    get() = _Globe ?: UXIcon(name = "Globe") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
            arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
            close()
            moveTo(20.94f, 11f)
            lineTo(17.46f, 11f)
            arcToRelative(18.37f, 18.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.29f, -7.41f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.94f, 11f)
            close()
            moveTo(9.69f, 14f)
            horizontalLineToRelative(4.63f)
            arcTo(16.95f, 16.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 19.9f)
            arcTo(16.94f, 16.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.69f, 14f)
            close()
            moveTo(9.55f, 11f)
            arcTo(16.25f, 16.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 4.1f)
            arcTo(16.24f, 16.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.45f, 11f)
            close()
            moveTo(8.83f, 3.59f)
            arcTo(18.37f, 18.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.54f, 11f)
            lineTo(3.06f, 11f)
            arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.83f, 3.59f)
            close()
            moveTo(3.23f, 14f)
            lineTo(6.64f, 14f)
            arcToRelative(18.91f, 18.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.19f, 6.41f)
            arcTo(9.02f, 9.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.23f, 14f)
            close()
            moveTo(15.17f, 20.41f)
            arcTo(18.88f, 18.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.36f, 14f)
            horizontalLineToRelative(3.41f)
            arcTo(9.02f, 9.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.17f, 20.41f)
            close()
        }
    }.also { _Globe = it }
