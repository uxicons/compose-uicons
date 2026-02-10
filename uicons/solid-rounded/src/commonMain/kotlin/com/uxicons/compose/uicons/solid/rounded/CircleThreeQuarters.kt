package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleThreeQuarters: ImageVector? = null

val Icons.Sr.CircleThreeQuarters: ImageVector
    get() = _CircleThreeQuarters ?: UXIcon(name = "CircleThreeQuarters") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.98f, 24f)
                curveToRelative(-0.44f, 0f, -0.89f, -0.02f, -1.34f, -0.07f)
                curveTo(5.13f, 23.32f, 0.68f, 18.87f, 0.08f, 13.36f)
                curveTo(-0.61f, 7.2f, 3.5f, 1.36f, 9.43f, 0.07f)
                curveToRelative(0.86f, -0.19f, 1.75f, 0.03f, 2.44f, 0.58f)
                curveToRelative(0.72f, 0.58f, 1.13f, 1.44f, 1.13f, 2.36f)
                verticalLineToRelative(7.99f)
                horizontalLineToRelative(7.99f)
                curveToRelative(0.92f, 0f, 1.78f, 0.41f, 2.36f, 1.13f)
                curveToRelative(0.56f, 0.69f, 0.77f, 1.58f, 0.58f, 2.44f)
                curveToRelative(-1.2f, 5.49f, -6.31f, 9.43f, -11.96f, 9.43f)
                close()
            }
        }.also { _CircleThreeQuarters = it}
