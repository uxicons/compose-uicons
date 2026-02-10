package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentCheck: ImageVector? = null

val Icons.Ts.CommentCheck: ImageVector
    get() = _CommentCheck ?: UXIcon(name = "CommentCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                horizontalLineToRelative(-12f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                verticalLineToRelative(12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                close()
                moveTo(11.52f, 15.55f)
                lineToRelative(7.1f, -7.01f)
                lineToRelative(-0.7f, -0.71f)
                lineToRelative(-7.1f, 7.01f)
                curveToRelative(-0.21f, 0.21f, -0.56f, 0.21f, -0.78f, -0.0f)
                lineToRelative(-3.96f, -3.88f)
                lineToRelative(-0.7f, 0.71f)
                lineToRelative(3.96f, 3.87f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.45f, 1.09f, 0.45f)
                reflectiveCurveToRelative(0.8f, -0.16f, 1.09f, -0.45f)
                close()
            }
        }.also { _CommentCheck = it}
