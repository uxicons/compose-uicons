package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Incognito: ImageVector? = null

val Icons.Br.Incognito: ImageVector
    get() = _Incognito ?: UXIcon(name = "Incognito") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.85f, 7.1f)
            curveTo(19.03f, 0.6f, 15.01f, 0.02f, 14.96f, 0.01f)
            arcTo(1.52f, 1.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.78f, 0f)
            arcToRelative(5.18f, 5.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 0.99f)
            arcTo(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.21f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.18f, 0.01f)
            curveTo(8.99f, 0.02f, 4.97f, 0.6f, 4.15f, 7.1f)
            curveTo(2.72f, 7.56f, 0f, 8.71f, 0f, 10.71f)
            curveTo(0f, 14.67f, 6.19f, 15f, 12f, 15f)
            reflectiveCurveToRelative(12f, -0.33f, 12f, -4.29f)
            curveTo(24f, 8.71f, 21.28f, 7.56f, 19.85f, 7.1f)
            close()
            moveTo(7f, 10.34f)
            verticalLineTo(9.5f)
            curveTo(7f, 4.44f, 8.84f, 3.25f, 9.36f, 3.02f)
            arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.77f, 0.34f)
            arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.75f, 0f)
            arcToRelative(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.77f, -0.34f)
            curveTo(15.15f, 3.25f, 17f, 4.43f, 17f, 9.5f)
            verticalLineToRelative(0.84f)
            arcTo(17.43f, 17.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 11f)
            arcTo(17.43f, 17.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 10.34f)
            close()
            moveTo(21f, 20f)
            arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.8f, 1.19f)
            arcTo(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21f)
            arcToRelative(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.2f, 0.19f)
            arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.26f, -3.02f)
            arcTo(7.53f, 7.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
            arcToRelative(7.53f, 7.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.46f, 0.17f)
            arcTo(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 20f)
            close()
        }
    }.also { _Incognito = it }
