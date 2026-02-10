package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BellSchool: ImageVector? = null

val Icons.Br.BellSchool: ImageVector
    get() = _BellSchool ?: UXIcon(name = "BellSchool") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9.5f, 8f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 1.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, -1.5f)
            close()
            moveTo(20.5f, 7f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.09f, 6.99f)
            curveToRelative(-1.25f, 3.58f, -4.45f, 6.2f, -8.85f, 7f)
            arcToRelative(0.45f, 0.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.38f, -0.1f)
            arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.19f, -0.4f)
            verticalLineToRelative(-1.61f)
            arcToRelative(9.39f, 9.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.39f, -2.84f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.18f, -2.06f)
            arcToRelative(6.43f, 6.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.71f, 2.03f)
            arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.28f, -10.28f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.44f, -1.75f)
            arcToRelative(9.5f, 9.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9.22f, 14.9f)
            verticalLineToRelative(1.62f)
            arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.26f, 2.7f)
            arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.22f, 0.81f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.62f, -0.06f)
            curveToRelative(7.12f, -1.29f, 11.89f, -6.69f, 11.89f, -13.44f)
            arcToRelative(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
            close()
        }
    }.also { _BellSchool = it }
