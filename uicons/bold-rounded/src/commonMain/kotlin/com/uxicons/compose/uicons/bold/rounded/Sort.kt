package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sort: ImageVector? = null

val Icons.Br.Sort: ImageVector
    get() = _Sort ?: UXIcon(name = "Sort") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.44f, 11f)
            lineTo(5.56f, 11f)
            arcTo(2.55f, 2.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.2f, 9.46f)
            arcToRelative(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -2.68f)
            lineTo(9.8f, 0.91f)
            arcTo(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0f)
            arcToRelative(3.11f, 3.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 0.96f)
            lineToRelative(6.01f, 5.78f)
            arcTo(2.45f, 2.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.8f, 9.46f)
            arcTo(2.55f, 2.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.44f, 11f)
            close()
            moveTo(18.14f, 8.87f)
            horizontalLineToRelative(0f)
            close()
            moveTo(6.76f, 8f)
            lineTo(17.24f, 8f)
            lineTo(12f, 3f)
            curveToRelative(-0.02f, 0.02f, -0.11f, 0.06f, -0.12f, 0.07f)
            close()
            moveTo(12f, 24f)
            arcToRelative(3.11f, 3.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.25f, -0.96f)
            lineTo(3.74f, 17.26f)
            arcTo(2.45f, 2.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.2f, 14.54f)
            arcTo(2.55f, 2.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.56f, 13f)
            lineTo(18.44f, 13f)
            arcToRelative(2.55f, 2.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.36f, 1.54f)
            arcToRelative(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 2.68f)
            lineToRelative(-6.1f, 5.87f)
            arcTo(3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
            close()
            moveTo(6.76f, 16f)
            lineTo(12f, 21f)
            curveToRelative(0.02f, -0.02f, 0.11f, -0.06f, 0.12f, -0.07f)
            lineTo(17.24f, 16f)
            close()
            moveTo(18.44f, 16f)
            horizontalLineToRelative(0f)
            close()
        }
    }.also { _Sort = it }
