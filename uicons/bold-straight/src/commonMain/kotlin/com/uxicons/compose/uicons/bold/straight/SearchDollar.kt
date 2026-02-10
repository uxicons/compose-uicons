package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchDollar: ImageVector? = null

val Icons.Bs.SearchDollar: ImageVector
    get() = _SearchDollar ?: UXIcon(name = "SearchDollar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.98f, 21.86f)
                lineToRelative(-5.93f, -5.93f)
                curveToRelative(1.23f, -1.66f, 1.95f, -3.71f, 1.95f, -5.93f)
                curveTo(20f, 4.49f, 15.51f, 0f, 10f, 0f)
                reflectiveCurveTo(0f, 4.49f, 0f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                curveToRelative(2.22f, 0f, 4.27f, -0.73f, 5.93f, -1.95f)
                lineToRelative(5.93f, 5.93f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(14f, 8f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                curveToRelative(0f, 0.29f, 0.18f, 0.56f, 0.45f, 0.66f)
                lineToRelative(2.22f, 0.89f)
                curveToRelative(1.42f, 0.57f, 2.33f, 1.92f, 2.33f, 3.45f)
                curveToRelative(0f, 1.58f, -1.06f, 2.9f, -2.5f, 3.34f)
                verticalLineToRelative(1.16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.16f)
                curveToRelative(-1.44f, -0.43f, -2.5f, -1.76f, -2.5f, -3.34f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                curveToRelative(0f, -0.29f, -0.18f, -0.56f, -0.45f, -0.66f)
                lineToRelative(-2.22f, -0.89f)
                curveToRelative(-1.42f, -0.57f, -2.33f, -1.92f, -2.33f, -3.45f)
                curveToRelative(0f, -1.58f, 1.06f, -2.9f, 2.5f, -3.34f)
                verticalLineToRelative(-1.16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.16f)
                curveToRelative(1.44f, 0.43f, 2.5f, 1.76f, 2.5f, 3.34f)
                verticalLineToRelative(0.5f)
                close()
            }
        }.also { _SearchDollar = it}
