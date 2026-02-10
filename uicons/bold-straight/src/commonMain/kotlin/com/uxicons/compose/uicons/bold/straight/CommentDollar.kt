package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentDollar: ImageVector? = null

val Icons.Bs.CommentDollar: ImageVector
    get() = _CommentDollar ?: UXIcon(name = "CommentDollar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                horizontalLineToRelative(12f)
                lineTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(21f, 21f)
                lineTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                verticalLineToRelative(9f)
                close()
                moveTo(16f, 9.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                curveToRelative(0f, 0.29f, 0.18f, 0.56f, 0.45f, 0.67f)
                lineToRelative(2.21f, 0.89f)
                curveToRelative(1.42f, 0.57f, 2.34f, 1.92f, 2.34f, 3.45f)
                curveToRelative(0f, 1.58f, -1.06f, 2.92f, -2.5f, 3.35f)
                verticalLineToRelative(1.15f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.15f)
                curveToRelative(-1.44f, -0.43f, -2.5f, -1.77f, -2.5f, -3.35f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -0.29f, -0.18f, -0.56f, -0.45f, -0.67f)
                lineToRelative(-2.21f, -0.89f)
                curveToRelative(-1.42f, -0.57f, -2.34f, -1.92f, -2.34f, -3.45f)
                curveToRelative(0f, -1.58f, 1.06f, -2.92f, 2.5f, -3.35f)
                verticalLineToRelative(-1.15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.15f)
                curveToRelative(1.44f, 0.43f, 2.5f, 1.77f, 2.5f, 3.35f)
                close()
            }
        }.also { _CommentDollar = it}
