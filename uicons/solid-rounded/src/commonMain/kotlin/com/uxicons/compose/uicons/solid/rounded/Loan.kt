package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Loan: ImageVector? = null

val Icons.Sr.Loan: ImageVector
    get() = _Loan ?: UXIcon(name = "Loan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.0f, 6.08f)
                curveToRelative(0f, -1.67f, 1.58f, -3.48f, 3.14f, -4.22f)
                curveToRelative(-0.18f, -0.18f, -0.36f, -0.38f, -0.51f, -0.6f)
                curveToRelative(-0.37f, -0.53f, 0.05f, -1.26f, 0.69f, -1.26f)
                horizontalLineToRelative(2.35f)
                curveToRelative(0.68f, 0f, 1.06f, 0.78f, 0.65f, 1.33f)
                curveToRelative(-0.14f, 0.19f, -0.3f, 0.37f, -0.46f, 0.53f)
                curveToRelative(1.56f, 0.75f, 3.14f, 2.56f, 3.14f, 4.22f)
                curveToRelative(0f, 1.61f, -1.23f, 2.92f, -2.75f, 2.92f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.52f, 0f, -2.75f, -1.31f, -2.75f, -2.92f)
                close()
                moveTo(23.15f, 8.68f)
                curveToRelative(-0.52f, -0.47f, -1.19f, -0.71f, -1.88f, -0.68f)
                curveToRelative(-0.7f, 0.03f, -1.34f, 0.33f, -1.79f, 0.83f)
                lineToRelative(-3.54f, 3.74f)
                curveToRelative(0.03f, 0.21f, 0.07f, 0.42f, 0.07f, 0.64f)
                curveToRelative(0f, 2.08f, -1.55f, 3.88f, -3.62f, 4.17f)
                lineToRelative(-4.25f, 0.6f)
                curveToRelative(-0.55f, 0.08f, -1.05f, -0.3f, -1.13f, -0.85f)
                curveToRelative(-0.08f, -0.55f, 0.3f, -1.05f, 0.85f, -1.13f)
                lineToRelative(4.16f, -0.58f)
                curveToRelative(0.94f, -0.13f, 1.75f, -0.81f, 1.94f, -1.73f)
                curveToRelative(0.3f, -1.43f, -0.79f, -2.69f, -2.16f, -2.69f)
                horizontalLineToRelative(-7.79f)
                curveTo(1.79f, 11f, 0.0f, 12.79f, 0.0f, 15f)
                verticalLineToRelative(5f)
                curveTo(0.0f, 22.21f, 1.79f, 24f, 4.0f, 24f)
                horizontalLineToRelative(4.26f)
                curveToRelative(2.81f, 0f, 5.48f, -1.18f, 7.37f, -3.25f)
                lineToRelative(7.7f, -8.41f)
                curveToRelative(0.95f, -1.06f, 0.86f, -2.71f, -0.19f, -3.67f)
                close()
            }
        }.also { _Loan = it}
