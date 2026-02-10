package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lasso: ImageVector? = null

val Icons.Br.Lasso: ImageVector
    get() = _Lasso ?: UXIcon(name = "Lasso") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13f, 0f)
            curveToRelative(-6.07f, 0f, -11f, 4.04f, -11f, 9f)
            arcToRelative(7.38f, 7.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.09f, 1.12f)
            curveToRelative(-0.02f, 0.02f, -0.04f, 0.03f, -0.06f, 0.05f)
            arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.49f, 5.04f)
            arcToRelative(6.3f, 6.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.55f, 4.29f)
            arcToRelative(4.37f, 4.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 4.5f)
            arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.49f, -1.48f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.47f, -1.52f)
            arcToRelative(1.38f, 1.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.52f, -1.5f)
            arcToRelative(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.22f, -2.75f)
            arcToRelative(17.35f, 17.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.25f, 0.26f)
            curveToRelative(0.17f, 0f, 0.33f, -0.01f, 0.49f, -0.01f)
            arcToRelative(13.09f, 13.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.04f, 1f)
            curveToRelative(6.07f, 0f, 11f, -4.04f, 11f, -9f)
            reflectiveCurveToRelative(-4.93f, -9f, -11f, -9f)
            close()
            moveTo(13f, 15f)
            arcToRelative(10.31f, 10.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.73f, -0.38f)
            arcToRelative(18.68f, 18.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.59f, -4.46f)
            arcToRelative(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.67f, -1.15f)
            verticalLineToRelative(-0.02f)
            curveToRelative(0f, -3.31f, 3.59f, -6f, 8f, -6f)
            reflectiveCurveToRelative(8f, 2.69f, 8f, 6f)
            reflectiveCurveToRelative(-3.59f, 6f, -8f, 6f)
            close()
        }
    }.also { _Lasso = it }
