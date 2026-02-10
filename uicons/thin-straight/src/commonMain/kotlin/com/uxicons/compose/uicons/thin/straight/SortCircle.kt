package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortCircle: ImageVector? = null

val Icons.Ts.SortCircle: ImageVector
    get() = _SortCircle ?: UXIcon(name = "SortCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(10.59f, 19.41f)
                curveToRelative(0.38f, 0.38f, 0.88f, 0.59f, 1.41f, 0.59f)
                reflectiveCurveToRelative(1.04f, -0.21f, 1.41f, -0.58f)
                lineToRelative(6.57f, -6.42f)
                lineTo(4.02f, 13f)
                lineToRelative(6.56f, 6.41f)
                close()
                moveTo(8.12f, 15.61f)
                lineToRelative(-1.65f, -1.61f)
                horizontalLineToRelative(3.3f)
                lineToRelative(-1.65f, 1.61f)
                close()
                moveTo(11.2f, 14f)
                horizontalLineToRelative(2.57f)
                lineToRelative(-3.65f, 3.56f)
                lineToRelative(-1.28f, -1.25f)
                lineToRelative(2.36f, -2.31f)
                close()
                moveTo(12.71f, 18.71f)
                curveToRelative(-0.38f, 0.38f, -1.03f, 0.38f, -1.42f, -0.0f)
                lineToRelative(-0.45f, -0.44f)
                lineToRelative(4.36f, -4.26f)
                horizontalLineToRelative(2.32f)
                lineToRelative(-4.82f, 4.71f)
                close()
                moveTo(13.41f, 4.59f)
                curveToRelative(-0.76f, -0.76f, -2.08f, -0.75f, -2.82f, -0.0f)
                lineToRelative(-6.57f, 6.42f)
                horizontalLineToRelative(15.95f)
                lineToRelative(-6.56f, -6.41f)
                close()
                moveTo(15.88f, 8.39f)
                lineToRelative(1.65f, 1.61f)
                horizontalLineToRelative(-3.3f)
                lineToRelative(1.65f, -1.61f)
                close()
                moveTo(12.8f, 10f)
                horizontalLineToRelative(-2.57f)
                lineToRelative(3.65f, -3.56f)
                lineToRelative(1.28f, 1.25f)
                lineToRelative(-2.36f, 2.31f)
                close()
                moveTo(11.29f, 5.29f)
                curveToRelative(0.38f, -0.38f, 1.03f, -0.38f, 1.42f, 0.0f)
                lineToRelative(0.45f, 0.44f)
                lineToRelative(-4.36f, 4.26f)
                horizontalLineToRelative(-2.32f)
                lineToRelative(4.82f, -4.71f)
                close()
            }
        }.also { _SortCircle = it}
