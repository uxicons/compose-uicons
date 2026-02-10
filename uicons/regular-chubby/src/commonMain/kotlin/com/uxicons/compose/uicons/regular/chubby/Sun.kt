package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sun: ImageVector? = null

val Icons.Rc.Sun: ImageVector
    get() = _Sun ?: UXIcon(name = "Sun") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 11f)
                horizontalLineToRelative(-2.27f)
                curveToRelative(-0.12f, -1.79f, -0.57f, -3.11f, -1.23f, -4.09f)
                lineToRelative(1.27f, -1.27f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-1.26f, 1.26f)
                curveToRelative(-1.22f, -0.85f, -2.71f, -1.14f, -4.1f, -1.22f)
                lineTo(13f, 2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.26f)
                curveToRelative(-1.4f, 0.08f, -2.88f, 0.38f, -4.1f, 1.22f)
                lineToRelative(-1.26f, -1.26f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(1.27f, 1.27f)
                curveToRelative(-0.66f, 0.98f, -1.11f, 2.3f, -1.23f, 4.09f)
                lineTo(2f, 11.0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.27f)
                curveToRelative(0.12f, 1.79f, 0.57f, 3.11f, 1.23f, 4.09f)
                lineToRelative(-1.27f, 1.27f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(1.26f, -1.26f)
                curveToRelative(1.22f, 0.85f, 2.71f, 1.14f, 4.1f, 1.22f)
                verticalLineToRelative(2.26f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.26f)
                curveToRelative(1.4f, -0.08f, 2.88f, -0.38f, 4.1f, -1.22f)
                lineToRelative(1.26f, 1.26f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-1.27f, -1.27f)
                curveToRelative(0.66f, -0.98f, 1.11f, -2.3f, 1.23f, -4.09f)
                horizontalLineToRelative(2.27f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(12f, 17.77f)
                curveToRelative(-3.56f, 0f, -5.77f, -0.96f, -5.77f, -5.77f)
                reflectiveCurveToRelative(2.21f, -5.77f, 5.77f, -5.77f)
                reflectiveCurveToRelative(5.77f, 0.96f, 5.77f, 5.77f)
                reflectiveCurveToRelative(-2.21f, 5.77f, -5.77f, 5.77f)
                close()
            }
        }.also { _Sun = it}
