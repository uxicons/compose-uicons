package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListCheck: ImageVector? = null

val Icons.Ts.ListCheck: ImageVector
    get() = _ListCheck ?: UXIcon(name = "ListCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 6f)
                curveToRelative(-0.67f, 0f, -1.3f, -0.26f, -1.77f, -0.73f)
                lineToRelative(-1.59f, -1.58f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(1.59f, 1.58f)
                curveToRelative(0.57f, 0.57f, 1.55f, 0.57f, 2.12f, 0f)
                lineToRelative(3.59f, -3.58f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.59f, 3.58f)
                curveToRelative(-0.47f, 0.47f, -1.1f, 0.73f, -1.77f, 0.73f)
                close()
                moveTo(24f, 4f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                close()
                moveTo(5.77f, 13.27f)
                lineToRelative(3.59f, -3.58f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.59f, 3.58f)
                curveToRelative(-0.57f, 0.57f, -1.55f, 0.57f, -2.12f, 0f)
                lineToRelative(-1.59f, -1.58f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(1.59f, 1.58f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.3f, -0.26f, 1.77f, -0.73f)
                close()
                moveTo(24f, 12f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                close()
                moveTo(5.77f, 21.27f)
                lineToRelative(3.59f, -3.58f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.59f, 3.58f)
                curveToRelative(-0.57f, 0.57f, -1.55f, 0.57f, -2.12f, 0f)
                lineToRelative(-1.59f, -1.58f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(1.59f, 1.58f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.3f, -0.26f, 1.77f, -0.73f)
                close()
                moveTo(24f, 20f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _ListCheck = it}
