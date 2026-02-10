package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pending: ImageVector? = null

val Icons.Rs.Pending: ImageVector
    get() = _Pending ?: UXIcon(name = "Pending") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 6f)
                verticalLineToRelative(5.31f)
                lineToRelative(4.16f, 2.55f)
                lineToRelative(-1.04f, 1.71f)
                lineToRelative(-5.12f, -3.14f)
                verticalLineToRelative(-6.43f)
                horizontalLineToRelative(2f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                curveToRelative(3.19f, 0f, 6.11f, 1.51f, 7.98f, 4f)
                horizontalLineToRelative(-3.98f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(23f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.06f)
                curveTo(18.75f, 1.51f, 15.51f, 0f, 12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(0.47f, 0f, 0.94f, -0.03f, 1.4f, -0.08f)
                lineToRelative(-0.23f, -1.99f)
                curveToRelative(-0.39f, 0.04f, -0.78f, 0.07f, -1.17f, 0.07f)
                close()
                moveTo(20.55f, 17.19f)
                lineToRelative(1.71f, 1.04f)
                curveToRelative(0.38f, -0.62f, 0.7f, -1.28f, 0.96f, -1.96f)
                lineToRelative(-1.87f, -0.71f)
                curveToRelative(-0.21f, 0.56f, -0.48f, 1.11f, -0.8f, 1.63f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 0.61f, -0.06f, 1.22f, -0.16f, 1.81f)
                lineToRelative(1.97f, 0.36f)
                curveToRelative(0.13f, -0.71f, 0.2f, -1.44f, 0.2f, -2.17f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(18.15f, 19.89f)
                lineToRelative(1.23f, 1.58f)
                curveToRelative(0.57f, -0.45f, 1.11f, -0.95f, 1.59f, -1.49f)
                lineToRelative(-1.49f, -1.33f)
                curveToRelative(-0.4f, 0.45f, -0.85f, 0.87f, -1.32f, 1.24f)
                close()
                moveTo(14.94f, 21.56f)
                lineToRelative(0.59f, 1.91f)
                curveToRelative(0.69f, -0.21f, 1.37f, -0.49f, 2.02f, -0.83f)
                lineToRelative(-0.93f, -1.77f)
                curveToRelative(-0.54f, 0.28f, -1.1f, 0.51f, -1.68f, 0.69f)
                close()
            }
        }.also { _Pending = it}
