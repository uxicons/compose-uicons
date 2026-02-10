package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ItalianCoffeeMaker: ImageVector? = null

val Icons.Ss.ItalianCoffeeMaker: ImageVector
    get() = _ItalianCoffeeMaker ?: UXIcon(name = "ItalianCoffeeMaker") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 5f)
                verticalLineToRelative(1.87f)
                lineToRelative(-3.0f, 3.5f)
                lineToRelative(-0.97f, 3.63f)
                horizontalLineToRelative(-3.02f)
                lineToRelative(0.78f, -7f)
                horizontalLineToRelative(-2.01f)
                lineToRelative(-0.78f, 7f)
                horizontalLineToRelative(-2f)
                lineToRelative(-0.78f, -7f)
                horizontalLineToRelative(-2.01f)
                lineToRelative(0.78f, 7f)
                horizontalLineToRelative(-3.02f)
                lineToRelative(-1.83f, -7f)
                horizontalLineToRelative(-1.13f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(7f)
                lineTo(1f, 15f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1.74f)
                lineTo(12f, 1.42f)
                lineTo(12f, 0f)
                horizontalLineToRelative(2f)
                lineTo(14f, 1.42f)
                lineToRelative(6.26f, 3.58f)
                horizontalLineToRelative(2.73f)
                close()
                moveTo(16.02f, 16f)
                lineToRelative(0.75f, 6f)
                horizontalLineToRelative(-2.02f)
                lineToRelative(-0.75f, -6f)
                horizontalLineToRelative(-2f)
                lineToRelative(-0.75f, 6f)
                horizontalLineToRelative(-2.02f)
                lineToRelative(0.75f, -6f)
                horizontalLineToRelative(-3.03f)
                lineToRelative(-1.91f, 6.21f)
                lineToRelative(-0.04f, 1.79f)
                lineTo(21f, 24f)
                verticalLineToRelative(-1.5f)
                lineToRelative(-1.96f, -6.5f)
                horizontalLineToRelative(-3.03f)
                close()
            }
        }.also { _ItalianCoffeeMaker = it}
